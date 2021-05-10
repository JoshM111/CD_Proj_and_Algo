// Setting and Swapping
// Set myNumber to 42. Set myName to your name. Now swap myNumber into myName & vice versa.

let myNumber = 42,
    myName = "Josh";
myName = [myNumber, myNumber = myName][0];
console.log("myNumber is now: " + myNumber);
console.log("myName is now: " + myName);

// Print -52 to 1066
// Print integers from -52 to 1066 using a FOR loop.

for( i= -52; i<1067; i++) {
    console.log(i);
} 

// Don’t Worry, Be Happy
// Create beCheerful(). Within it, console.log string "good morning!" Call it 98 times.

function beCheerful(x, y){
    console.log(x.repeat(y));
}
beCheerful("good morning!", 98);

// Multiples of Three – but Not All
// Using FOR, print multiples of 3 from -300 to 0. Skip -3 and -6.

for(let x = 3; x > -301; x--){
    if(x = -3) {
        continue;
    } else if(x = -6) {
        continue;
    } else {
        console.log(x);
    }
}

// Printing Integers with While
// Print integers from 2000 to 5280, using a WHILE.

let x = 2000;
while(x<5281){
    console.log(x);
    x++;
}

// You Say It’s Your Birthday
// If 2 given numbers represent your birth month and day in either order, log "How did you know?", else log "Just another day.." 
let newDate = (x, y);
function equalsTo(newDate){
    if(x,y){
        x.includes(9 + 28, 0) && y.includes(9 + 28, 0);
        console.log("How did you know?!");
    } else{
        console.log("Just another day...");
    }
}
equalsTo(newDate= (28,9));





// Leap Year
// Write a function that determines whether a given year is a leap year. If a year is divisible by four, it is a leap year, unless it is divisible by 100. However, if it is divisible by 400, then it is.








// Print and Count
// Print all integer multiples of 5, from 512 to 4096. Afterward, also log how many there were.

let y = 0;
for ( x = 512; x< 4097; x++){
    if(x % 5 === 0){
        y = y+1;
    }
    console.log(x);
}
console.log(y);

// Multiples of Six
// Print multiples of 6 up to 60,000, using a WHILE.

let x = 6;
do {
    x=x+6;
    console.log(x)
} while (x < 60000);

// Counting, the Dojo Way
// Print integers 1 to 100. If divisible by 5, print "Coding" instead. If by 10, also print " Dojo".

for(x=1; x<101; x++){
    if(x%5===0){
        console.log("Number: " + x );
        console.log("Coding");
    } 
    if (x%10===0) {
        console.log("Number: " + x );
        console.log("Dojo");
    } 
}

// What Do You Know?
// Your function will be given an input parameter incoming. Please console.log this value.

function know(x) {
    console.log(x);
}

know();

// Whoa, That Sucker’s Huge…
// Add odd integers from -300,000 to 300,000, and console.log the final sum. Is there a shortcut?
let y = 0
for(var x=-3; x<=3; x++){
    if(x%2!=0){
        y=y+x
    }
}
console.log(y*100000);






// Countdown by Fours
// Log positive numbers starting at 2016, counting down by fours (exclude 0), without a FOR loop.

let x = 2016;
do {
    console.log(x);
    x=x-4;
} while (x>0);






// Flexible Countdown
// Based on earlier “Countdown by Fours”, given lowNum, highNum, mult, print multiples of mult from highNum down to lowNum, using a FOR. For (2,9,3), print 9 6 3 (on successive lines).








// The Final Countdown
// This is based on “Flexible Countdown”. The parameter names are not as helpful, but the problem is essentially identical; don’t be thrown off! Given 4 parameters (param1,param2,param3,param4), print the multiples of param1, starting at param2 and extending to param3. One exception: if a multiple is equal to param4, then skip (don’t print) it. Do this using a WHILE. Given (3,5,17,9), print 6,12,15 (which are all of the multiples of 3 between 5 and 17, and excluding the value 9).







