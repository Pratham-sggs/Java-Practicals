class Staff
{
	public static void availableBooks(){
		
	}
	private boolean issueBook(String bookName,String Reg_no){
		if(booksIssuedNumber(Reg_no)>=maximumBookIssue(Reg_no))
		{
			return false;
		}
		bookCountDecrease(bookName);
		return true;
	}
	private void bookCountDecrease(String bookName)
	{
		getBook
	}
}
