let sent ="this is a sunny day";
let reverse=reverseword(sent);
console.log(reverse);
function reverseword(sent)
{
	let words=sent.split(" ");
	let reverseWords=[];
	for(let word of words)
	{
		let reverseWord="";
		
		for(let i=word.length -1;i>=0;i--)
		{
			reverseWord+=word[i];
			
		}
		reverseWords.push(reverseWord)
	}
  return reverseWords.join(" ");
}