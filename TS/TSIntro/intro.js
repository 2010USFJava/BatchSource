console.log("Roll Tide");
//JS Data Types
var s;
var s1 = "woo";
console.log(typeof (s));
console.log(typeof (s1));
//In TS, we can declare types
var s2; //implicitly any type
var s3; //s3 is of type number
var s4; //can restrict to multiple types
//s3='hello';
s4 = true;
console.log(typeof (s4));
s4 = 'hello';
console.log(typeof (s4));
s4 = 0;
console.log(typeof (s4));
//Tuples (fixed sixe and datatypes are ordered in array)
var myTuple;
myTuple = ['AHH', true, 9];
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
var carStates;
(function (carStates) {
    carStates[carStates["OFF"] = 0] = "OFF";
    carStates[carStates["IDLE"] = 1] = "IDLE";
    carStates[carStates["ACCEL"] = 2] = "ACCEL";
})(carStates || (carStates = {}));
;
var myCar;
if (myCar == carStates.ACCEL) {
    //define logic for ACCEL
}
//Functions
//in JS 
function myFunc(a, b, c) {
    //some logic
}
//In TS
function myTSFunc(a, b, c) {
    //define logic
}
//Return type in TS
function finalFunc() {
    return 'hello';
}
function voidFunc() {
}
var nix = { 'name': 'Pluto' };
var pluto = { 'name': 'Pluto', 'hasRings': false, 'moons': [nix],
    'orbit': function () { return console.log("I'm orbiting!"); } };
pluto.orbit();
var Star = /** @class */ (function () {
    function Star(name, nickname, size, planets) {
        this.name = name;
        this.nickname = nickname;
        this.size = size;
        this.planets = planets;
    }
    Star.prototype.fusion = function () {
        console.log(this.name + " is getting brighter!");
    };
    return Star;
}());
var Sun = new Star("The Sun", "Bright Thingy", 1, 9);
Sun.fusion();
var Animal = /** @class */ (function () {
    //When you add access modifiers in the parameter, it will automcatily assign it as a property 
    //questions marks in the constructor makes the parameter optional 
    // each parameter to the right of the question mark muyst also be optional
    function Animal(age, name, breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    Object.defineProperty(Animal.prototype, "Name", {
        get: function () {
            return this.name;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Animal.prototype, "Age", {
        get: function () {
            return this.age;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Animal.prototype, "Breed", {
        get: function () {
            console.log("double check to make sure");
            return this.breed;
        },
        set: function (breed) {
            this.breed = breed;
        },
        enumerable: true,
        configurable: true
    });
    return Animal;
}());
var dog = new Animal(null, null, null);
dog.Breed = "golden";
console.log(dog.Breed);
