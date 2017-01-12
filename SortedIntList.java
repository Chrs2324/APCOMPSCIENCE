public class SortedIntList extends IntList
{

	//-------------------------------------------------------------
	// Constructor -- creates an integer list of a given size.
	//-------------------------------------------------------------
	public SortedIntList(int size)
	{
		super(size);
	}


	//-------------------------------------------------------------
	// Adds an integer to the list.  If the list is full,
	// prints a message and does nothing.
	//-------------------------------------------------------------
	public void add(int value)
	{
		if (numElements == list.length)
		    System.out.println("Can't add, list is full");
		else
		{
			if (numElements == 0)
			{
				list[0] = value;
				numElements++;
			}
			else
			{
				for (int i = 0; i < numElements; i++)
				{
					if (list[numElements-1] < value)
					{
						list[numElements]=value;
						break;
					}
					if (list[i] >= value)
					{
						int temp;
						int temp2 = list[i];
						list[i] = value;
						list[i+1]=temp2;

						for (int k = i+1; k < numElements; k++)
						{
							temp = list[k];
							list[k] = temp2;
							temp2 = list[k+1];
						}
						break;
					}
					System.out.println(this);
				}
				numElements++;
			}
		}
	}
}