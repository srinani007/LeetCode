import React from 'react';
import './App.css';
import Home from './components/TempHome';
import Login from './components/Login'; // Import the Login component

function App() {
    return (
        <div className="App">
            <Home /> {/* Render the Home component */}
            <Login /> {/* Render the Login component */}
        </div>
    );
}

export default App;
