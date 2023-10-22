function shortArray(array)
{
	for(let i=0;i<array.length; i++)
	{
		for(let j=0; array.length-i-1; j++)
		{
			if(array[j] < array[j+1])
			{
				let temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				}
		}
	}
	return array;
}
let array=[1,2,3,5,4,7,8,9];
let short=shortArray(array);
console.log(short);