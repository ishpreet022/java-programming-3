/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallindrom;
class pallindrom
{
	
	public static int reverse(int n, int rev)
	{
		if (n == 0) {
			return rev;
		}

		rev = rev * 10 + (n % 10);
		rev = reverse(n / 10, rev);
		return rev;
	}

	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		rev = reverse(num, rev);
		return (num == rev);
	}

	public static void main(String[] args)
	{
		int n = 1221;

		if (isPalindrome(n)) {
			System.out.printf("Palindrome");
		} else {
			System.out.printf("Not Palindrome");
		}
	}
}