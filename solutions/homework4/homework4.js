
//main
var fs = require('fs');

fs.readFile("homework4-ops.txt", 'utf8', function(err, data) {
  if (err) throw err;
  var lines = data.split(/\r?\n/);

  for(var i = 0; i<lines.length; i++)
  {
    performOp(lines[i]);
  }

});

function performOp(operation)
{
  op = operation.replace(/\s/g, '');

  if (op == "")
  {
    console.log("Skipping blank line");
  }
  else if(op.indexOf("+") !== -1)
  {
    var nums = op.split("+");
    var answer = Number(nums[0]) + Number(nums[1]);
    console.log(operation+" = "+answer);
  }
  else if(op.indexOf("-") !== -1)
  {
    var nums = op.split("-");
    var answer = Number(nums[0]) - Number(nums[1]);
    console.log(operation+" = "+answer);
  }
  else if(op.indexOf("*") !== -1)
  {
    var nums = op.split("*");
    var answer = Number(nums[0]) * Number(nums[1]);
    console.log(operation+" = "+answer);
  }
  else if(op.indexOf("/") !== -1)
  {
    var nums = op.split("/");
    var answer = Number(nums[0]) /  Number(nums[1]);
    console.log(operation+" = "+answer);
  }
  else
  {
    console.log("not a valid op: "+operation);
  }
}
