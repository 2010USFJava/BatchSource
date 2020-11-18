function pow(event){
    element = event.currentTarget;
    element.style.backgroundColor="green";
    alert(element.id);
}

//anonymous function
window.onload= function (){
    //               useCapture/Event Propagation- false- Bubbling, target to Root
    //                                             true- capturing, root to target
    this.document.getElementById("A").addEventListener("click",pow,true);
    this.document.getElementById("B").addEventListener("click",pow,1);
    this.document.getElementById("C").addEventListener("click",pow,(5=="5"));
    this.document.getElementById("D").addEventListener("click",pow,true);
}