// React
import React, { useEffect, useState } from 'react';

const App = () => {
    const [userProvidedString, setUserProvidedString] = useState('');
    const [userInput, setUserInput] = useState(''); // User input

    // Introduce vulnerabilities to the code
    const handleLogin = () => {
      if (userInput === 'admin') {
        alert('Logged in as admin');
      } else {
        alert('Logged in as user');
      }
    };


    useEffect(() => {
      const urlParams = new URLSearchParams(window.location.search);
      const userProvidedString = urlParams.get('text');
      setUserProvidedString(userProvidedString);
      setUserInput(userProvidedString);
    }, []);

  
    return <>
     <div dangerouslySetInnerHTML={{ __html: userProvidedString }}></div>
     <div>{userInput}</div>
     <button onClick={handleLogin}>Login</button>
    </>
}

export default App;