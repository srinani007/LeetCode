import axios from "axios";
import React, { useEffect, useState } from "react";

const Dashboard = () => {
    const [user, setUser] = useState(null);

    useEffect(() => {
        axios.get('http://localhost:8080/user-info', {withCredentials: true})
        .then(response => {
            setUser(response.data);
            })
            .catch(error => {
                console.error('Error fetching user data:', error);
            });
    }, [])
    return(
        <div>
            <h1>Welcome to the Dashboard</h1>
            <p>This is a protected route. You can only access it if you are logged in.</p>
            {
                user ? (
                    <div>
                        <p><strong>Name:</strong> {user.name}</p>
                        <p><strong>Email:</strong> {user.email}</p>
                        {user.picture && <img src={user.picture}
                        alt="User Profile" 
                        style={{ maxWidth: '100px', borderRadius: '50%' }}
                        referrerPolicy="no-refferer"/>}
                    </div>
                ) : (
                    <div>
                        <p>Loading...</p>
                    </div>
                )
            }
        </div>
    );
}
export default Dashboard;