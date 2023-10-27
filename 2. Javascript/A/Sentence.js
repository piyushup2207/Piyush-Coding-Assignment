function reverseEveryWord(sentence) 
{
 var words = sentence.split(' ');
 var reversedWords = words.map(function(word) {
    return word.split('').reverse().join('');
 });

 return reversedWords.join(' ');
}
console.log(reverseEveryWord("Hello World!"));