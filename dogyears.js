/* convert human years to dog years*/
var humanAge = 15;
/* first 2 years of a dog's life are equal to 21 human years*/
var earlyYears = 2;
earlyYears *= 10.5;
laterYears = humanAge - 2;
dogLaterYears = laterYears * 4;
humanAgeInDogYears = dogLaterYears + earlyYears;
var myName = 'Luis';

console.log(`My name is ${myName}. I am ${humanAge} years old in human years which is ${humanAgeInDogYears} years old in dog years.`);
