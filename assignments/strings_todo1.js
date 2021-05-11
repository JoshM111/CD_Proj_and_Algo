// Remove Blanks
// Create a function that, given a string, returns all of that string’s contents, but without blanks. 
// If given the string " Pl ayTha tF u nkyM usi c ", return "PlayThatFunkyMusic".

var wordStr = " Pl ayTha tF u nkyM usi c ";
newArray = wordStr.split(" ");
console.log(newArray);
console.log(newArray.join(""));
// "PlayThatFunkyMusic"

// Get Digits
// Create a JavaScript function that given a string, returns the integer made from the string’s digits. Given "0s1a3y5w7h9a2t4?6!8?0", the function should return the number 1357924680.

var myString = "0s1a3y5w7h9a2t4?6!8?0";
function stripValues(){
  myString = myString.replace(/\D/g,'');
  console.log(myString);
}
stripValues();

// Acronyms
// Create a function that, given a string, returns the string’s acronym (first letters only, capitalized). 
// Given " there's no free lunch - gotta pay yer way. ", return "TNFL-GPYW". 
// Given "Live from New York, it's Saturday Night!", return "LFNYISN".

function firstLetter(word) {
    return word[0];
};
function getAcronym(str){
    var words = str.split(" "); 
    var acr = words.map(firstLetter);
    return acr.join("").toUpperCase();
};
 
getAcronym(" there's no free lunch - gotta pay yer way. ");
console.log(getAcronym(" there's no free lunch - gotta pay yer way. "));

// Count Non-Spaces
// Accept a string and return the number of non-space characters found in the string. 
// For example, given "Honey pie, you are driving me crazy", return 29 (not 35).

function noSpace(str){
    newArray = str.split(" ");
    newArray1 = newArray.join("");
    return newArray1.length;
}
console.log(noSpace("Honey pie, you are driving me crazy"));

// Remove Shorter Strings
// Given a string array and value (length), remove any strings shorter than the length from the array.

function noShorts(arr){
    var x = arr.length;
    for ( var i = 0; i < arr.length; i++ ) {
      console.log(arr.length);
      console.log(arr[i].length);
        if ( arr[i].length < x ) {
            arr.pop();
        }
    }
    return arr;
}
console.log(noShorts(["asdas", "asdassdsadas", "asdasdsad", "a", "dddd", "ss", "asdadasd"]));




