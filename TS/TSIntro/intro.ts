console.log("Roll Tide");

//JS Data Types
let s;
let s1= "woo";
console.log(typeof(s));
console.log(typeof(s1));

//In TS, we can declare types
let s2; //implicitly any type
let s3:number; //s3 is of type number
let s4: number| boolean|string; //can restrict to multiple types

//s3='hello';
s4= true;
console.log(typeof(s4));
s4= 'hello';
console.log(typeof(s4));
s4=0;
console.log(typeof(s4));

//Tuples (fixed sixe and datatypes are ordered in array)

let myTuple: [string, boolean, number];
myTuple= ['AHH',true,9];

//Enums- collection of constants, representaional values

//In JS
// const OFF=0;
// const IDLE =1;
// const ACCEL=2;
//bunch of logic
//  let myCar=ACCEL;
// if(myCar==OFF){
//     //define logic for off
// }
// myCar=6;

//Enums In TS:
enum carStates{OFF=0,IDLE=1,ACCEL=2};
let myCar;
if(myCar==carStates.ACCEL){
    //define logic for ACCEL
}

//Functions
//in JS 
function myFunc(a,b,c){
    //some logic
}

//In TS
function myTSFunc(a:number,b:string,c:boolean){
    //define logic
}

//Return type in TS
function finalFunc():string{
    return 'hello';
}

function voidFunc():void{
    
}

//Interfaces - very similar to a java bean
interface Moon{
    name:string
}

interface Planet{
    name:string,
    hasRings:boolean,
    moons:Array<Moon>,
    orbit():void;
}
let nix:Moon={'name':'Pluto'};

let pluto:Planet ={'name':'Pluto', 'hasRings':false,'moons': [nix],
                   'orbit':()=>console.log("I'm orbiting!")};

pluto.orbit();

class Star implements Moon{
    /**
     *Acess modifiers in typescript:
        private, public, protected. There is no equivalent to "default".
        public acts as the implicit modifier, if you don't use a keyword. 
     */

    public name:string; //accesible anywhere
    nickname:string;
    private planets:number; //accessible only inside your class
    protected size:number; //accessible internally or any class that extends it.

    constructor(name:string, nickname: string, size:number,planets:number){
        this.name=name;
        this.nickname=nickname;
        this.size=size;
        this.planets=planets;
    }

    fusion():void{
        console.log(`${this.name} is getting brighter!`);
    }
}

let Sun:Star= new Star("The Sun", "Bright Thingy",1,9);

Sun.fusion();