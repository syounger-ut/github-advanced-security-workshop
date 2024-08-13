const express = require('express');
const app = express();
const port = 3000;
const db = require('./db');

app.get('/health', (req, res) => {
    res.send('OK');
});

app.get('/vulnerable', (req, res) => {
    const userProvidedString = req.query.text;
    res.send(userProvidedString);
});

// SQL Injection
app.get('/injection', (req, res) => {
    const userProvidedString = req.query.text;
    const sql = `SELECT * FROM users WHERE name='` + userProvidedString + `'`;
    db.query(sql, (err, result) => {
        if (err) throw err;
        res.send(result);
    });
});

// Unvalidated Redirects and Forwards
app.get('/redirect', (req, res) => {
    const redirectUrl = req.query.url;
    res.redirect(redirectUrl);
});

// Security Misconfiguration
app.get('/debug', (req, res) => {
    const debugInfo = {
        env: process.env,
        config: require('./config')
    };
    res.send(debugInfo);
});


app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`);
});