import React, { useState } from "react";
import { FcGoogle } from "react-icons/fc";
import { AiFillGithub } from "react-icons/ai";

const Home = () => {
    const [isLoading, setIsLoading] = useState(false);
    const [error, setError] = useState("");

    const handleRedirect = (url) => {
        try {
            setIsLoading(true);
            setError("");
            window.location.href = url;
        } catch (error) {
            console.error("Redirection failed:", error);
            setIsLoading(false);
            setError("Failed to redirect. Please try again.");
        }
    };

    const googleLogin = () =>
        handleRedirect(process.env.REACT_APP_GOOGLE_AUTH_URL || "http://localhost:8080/oauth2/authorization/google");
    const gitHubLogin = () =>
        handleRedirect(process.env.REACT_APP_GITHUB_AUTH_URL || "http://localhost:8080/oauth2/authorization/github");

    const buttonStyle = {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        margin: '10px',
        padding: '10px 20px',
        fontSize: '16px',
        cursor: 'pointer',
        border: '1px solid #ccc',
        borderRadius: '5px',
        backgroundColor: '#f9f9f9',
        color: 'black', // Set font color to black
        boxShadow: '0 4px 6px rgba(0, 0, 0, 0.1)',
        transition: 'background-color 0.3s',
    };

    return (
        <div>
            <h1>Welcome to The OauthDemo</h1>
            <button
                onClick={googleLogin}
                style={buttonStyle}
                disabled={isLoading}
                aria-label="Login with Google"
            >
                <FcGoogle size={20} /> Login with Google
            </button>
            <button
                onClick={gitHubLogin}
                style={buttonStyle}
                disabled={isLoading}
                aria-label="Login with GitHub"
            >
                <AiFillGithub size={20} /> Login with GitHub
            </button>
            {isLoading && <p>Redirecting...</p>}
            {error && <p style={{ color: 'red' }}>{error}</p>}
        </div>
    );
};

export default Home;
