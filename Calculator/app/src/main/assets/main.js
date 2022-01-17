function masum() {
  var mm=document.getElementById('des').value;
  var mn=document.getElementById('des').value=eval(rans(mm));
}
function rans(rnum) {
  for (var i = 0; i < rnum.length; i++) {
    if (rnum[i]=="x") {
      rnum=rnum.replace("x","*");
    }
    if (rnum[i]=="÷") {
      rnum=rnum.replace("÷","/");
    }
  }
  return rnum;
}