import React, {useState}from "react";

const Login = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");
    const [jwt, setJwt] = useState("");

    const handleLogin = async (e) => {
        e.preventDefault();
        try{
            const response = await fetch("http://localhost:8080/signin",{
                method:"POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({username, password}),
            }
            );
            if(response.ok){
                const data = await response.json();
                console.log(data);
                setJwt(data.token);
                setMessage("Login successful");
            }else{
                setMessage("Login failed");
            }

        }catch(error){
            console.error("Error : " + error);
            setMessage("An error occurred during login");
        }
        
    }
    return (
        <div>
            <h2>Login</h2>
            <form onSubmit={handleLogin}>
                <div>
                    <label>Username : </label>
                    <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
                </div>
                <div>
                    <label>Password : </label>
                    <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
                <button type="submit">Login</button>
            </form>
            <p>{message}</p>
            <p>{jwt}</p>
        </div>
    );

}
export default Login;