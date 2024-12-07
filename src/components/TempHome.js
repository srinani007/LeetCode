import React, { useState } from "react";

const Home = () => {
    const [isLoading, setIsLoading] = useState(false);

    const handleRedirect = (url) => {
        try {
            setIsLoading(true);
            window.location.href = url;
        } catch (error) {
            console.error("Redirection failed:", error);
            setIsLoading(false);
        }
    };

    const googleLogin = () => handleRedirect(process.env.REACT_APP_GOOGLE_AUTH_URL || 'http://localhost:8080/oauth2/authorization/google');
    const gitHubLogin = () => handleRedirect(process.env.REACT_APP_GITHUB_AUTH_URL || 'http://localhost:8080/oauth2/authorization/github');

    const buttonStyle = {
        margin: '10px',
        padding: '10px 20px',
        fontSize: '16px',
        cursor: 'pointer',
    };

    return (
        <div>
            <h1>Welcome to The OauthDemo</h1>
            <button onClick={googleLogin} style={buttonStyle} disabled={isLoading}>
                Login with Google
            </button>
            <button onClick={gitHubLogin} style={buttonStyle} disabled={isLoading}>
                Login with GitHub
            </button>
            {isLoading && <p>Redirecting...</p>}
        </div>
    );
};

export default Home;
