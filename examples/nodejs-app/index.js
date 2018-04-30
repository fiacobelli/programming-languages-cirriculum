const http = require('http');


const server = http.createServer((request, response) => {

  console.log(request.url);

  if(request.url == '/rest/test/')
  {
     console.log('Using the REST portion');
     response.statusCode = 200;
     response.setHeader('Content-Type', 'application/json');
     const restTest = {data: 'He there from the REST service!'};
     response.write(JSON.stringify(restTest));
     response.end();
  }
  else {
    console.log('Everything else');
    response.statusCode = 200;
    response.setHeader('Content-Type', 'text/plain');
    response.write("Hi there!");
    response.end();
  }
});

server.listen(3000, () => {
  console.log('Go to http://localhost:3000 to see the server running');
});
