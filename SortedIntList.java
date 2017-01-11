public class SortedIntList extends IntList
{
	protected int[] list;
	protected int numElements = 0;

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
			list[numElements] = value;
			numElements++;
		}
    }

    public void sortList(int size)
	{
		int[] sortedList = list.clone();
		for (int i = 0; i < sortedList.length; i++)
		{
			for (int q = i+1; q < sortedList.length; i++)
			{
				if ((sortedList[i] > sortedList[q] && (i != q)))
				{
					int temp = sortedList[q];
					sortedList[q] = sortedList[i];
					sortedList[i] = temp;
				}
			}
		}
	}
}

