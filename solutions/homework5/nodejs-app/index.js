var express = require('express');
var path = require('path');
var app = express();

//hw6
app.use('/',express.static(path.join(__dirname, 'public')));

app.get('/add', function(req, res){
  var answer = Number(req.query.lhs) + Number(req.query.rhs);
  res.send(JSON.stringify({'answer': answer}));
});

app.get('/subtract', function(req, res){
  var answer = Number(req.query.lhs) - Number(req.query.rhs);
  res.send(JSON.stringify({'answer': answer}));
});

app.get('/multiply', function(req, res){
  var answer = Number(req.query.lhs) * Number(req.query.rhs);
  res.send(JSON.stringify({'answer': answer}));
});

app.get('/divide', function(req, res){
  var answer = Number(req.query.lhs) / Number(req.query.rhs);
  res.send(JSON.stringify({'answer': answer}));
});

app.listen(3000);
