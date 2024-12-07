import React from 'react';

const Login = () => {
    const handleLogin = () => {
        console.log('Login logic goes here');
        // Implement login logic here, such as form submission or API integration
    };

    return (
        <div>
            <h2>Login</h2>
            <form onSubmit={(e) => e.preventDefault()}>
                <div>
                    <label>
                        Username:
                        <input type="text" name="username" placeholder="Enter your username" />
                    </label>
                </div>
                <div>
                    <label>
                        Password:
                        <input type="password" name="password" placeholder="Enter your password" />
                    </label>
                </div>
                <button onClick={handleLogin}>Login</button>
            </form>
        </div>
    );
};

export default Login;
