function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
  
    // Test Case 1:
    if (username.trim() === '' || password.trim() === '') {
      document.getElementById('error-message').innerText = 'Please enter both username and password.';
      document.getElementById('error-message').style.display = 'block';
      return;
    }
  
    // Test Case 2: 
    if (username === 'laiba' && password === '123456') {
      alert('Login successful!');
      
      document.getElementById('error-message').innerText = '';
      document.getElementById('error-message').style.display = 'none';
    } else {
      // Test Case 3:
      document.getElementById('error-message').innerText = 'Incorrect username or password.';
      document.getElementById('error-message').style.display = 'block';
    }
  }
  