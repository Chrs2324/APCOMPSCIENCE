// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create and fill
// a list of integers.
//
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    private int foobar = 0;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
	foobar = size;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;

    }


    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i < list.length; i++)
	    System.out.println(i + ":\t" + list[i]);
    }


    //--------------------------------------------------------------
    // Doubles the size of the list.
    //--------------------------------------------------------------
	private void increaseSize()
	{
		int[] temp = new int[list.length * 2];

		for (int i = 0; i < list.length; i++)
		{
			temp [i] = list[i];
		}
		list = temp;
	}

    //--------------------------------------------------------------
    // Adds an element to the list.  If the array is full its size
    // is doubled first.
    //--------------------------------------------------------------
	public void addElement(int newVal)
	{
		if (foobar == list.length)
		{
			increaseSize();
		}
		list[foobar] = newVal;
		foobar++;
	}

    //---------------------------------------------------------------
    // Removes the first occurrence of newVal from the list.
    //---------------------------------------------------------------
	public void removeFirst(int newVal)
	{
		boolean flag = false;

		for (int i = 0; i < list.length; i++)
		{
			if (list[i]==newVal)
			{
				flag = true;
			}
			if (flag)
			{
				if (i+1 < foobar)
				{
					list[i] = list[i + 1];
				}
			}
			if (flag)
			{
				list[foobar - 1] = 0;
				foobar--;
			}
		}
	}



    //-------------------------------------------------------------
    //  Removes all occurrences of newVal from the list.
    //-------------------------------------------------------------
	public void removeAll(int newVal)
	{
		int search = 0;

		for (int i = 0; i < list.length; i++)
		{
			if (list[i]==newVal)
			{
				foobar--;

				for (int g = i; g < list.length; g++)
				{
					if (g+1 < foobar)
					{
						list[g] = list[g + 1];
					}
					else
					{
						list[g] = 0;
					}
				}
			}
		}
	}
}

