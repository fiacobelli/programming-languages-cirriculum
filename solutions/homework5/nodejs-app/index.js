var express = require('express');
var app = express();

app.get('/add', function(req, res){
  var answer = Number(req.query.lhs) + Number(req.query.rhs);
  res.send('answer: ' + answer);
});

app.get('/subtract', function(req, res){
  var answer = Number(req.query.lhs) - Number(req.query.rhs);
  res.send('answer: ' + answer);
});

app.get('/multiply', function(req, res){
  var answer = Number(req.query.lhs) * Number(req.query.rhs);
  res.send('answer: ' + answer);
});

app.get('/divide', function(req, res){
  var answer = Number(req.query.lhs) / Number(req.query.rhs);
  res.send('answer: ' + answer);
});

app.listen(3000);
