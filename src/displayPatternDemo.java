/**
Siam-Al-mer Chowdhury
 * CSC 201-004N
 Professor Tanes Kanchanawanchai
 Assignment
 ***** BEGIN LICENSE BLOCK *****
 Version: MPL 1.1/GPL 2.0/LGPL 2.1
 The contents of this file are subject to the Mozilla Public License Version
 1.1 (the "License"); you may not use this file except in compliance with
 the License. You may obtain a copy of the License at
 http://www.mozilla.org/MPL/
 Software distributed under the License is distributed on an "AS IS" basis,
 WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 for the specific language governing rights and limitations under the
 License.
 The Initial Developer of the Original Code is
 Tushar Balarajan.
 Portions created by the Initial Developer are Copyright (C) 2017
 the Initial Developer. All Rights Reserved.
 Contributor(s):
 Alternatively, the contents of this file may be used under the terms of
 either the GNU General Public License Version 2 or later (the "GPL"), or
 the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 in which case the provisions of the GPL or the LGPL are applicable instead
 of those above. If you wish to allow use of your version of this file only
 under the terms of either the GPL or the LGPL, and not to allow others to
 use your version of this file under the terms of the MPL, indicate your
 decision by deleting the provisions above and replace them with the notice
 and other provisions required by the GPL or the LGPL. If you do not delete
 the provisions above, a recipient may use your version of this file under
 the terms of any one of the MPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****
 */
 /** This java program demonstrate the method
 * dispay pattern
 * that prints pattern of size,n
 */
public class displayPatternDemo {
    public static void main (String [] args){
        int n=9;
        //call method displayPattern
        displayPattern(n);
    }

    private static void displayPattern(int n) {
    int temp;
    //copy n value to temp variable
    temp=n;

    for (int i=1;i<=n;i++){
// to print space
        for (int j=1;j<temp;j++)
            System.out.print(" ");
//to print number on the same libe
        for (int m=i;m>0;m--)
            System.out.print(m);
        //to get a new line
        System.out.println();

        temp=temp-1;
    }
    }
}
