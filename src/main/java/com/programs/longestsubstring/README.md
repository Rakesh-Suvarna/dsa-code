**Problem: Longest Substring Without Repeating Characters
Difficulty: Medium**

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

**Qn-2: Longest Substring with At Most Two Distinct Characters**
**Description**
Given a string, find the length of the longest substring T that contains at most 2 distinct characters.

Example
Example 1
Input: “eceba”
Output: 3
Explanation:
T is "ece" which its length is 3.
Example 2
Input: “aaa”
Output: 3



**Qn-3: Longest Substring with At Most K Distinct Characters
Description**
Given a string S, find the length of the longest substring T that contains at most k distinct characters.

Example
Example 1:

Input: S = "eceba" and k = 3
Output: 4
Explanation: T = "eceb"
Example 2:

Input: S = "WORLD" and k = 4
Output: 4
Explanation: T = "WORL" or "ORLD"

**Qn-4: Sliding Window Maximum
Difficulty: Medium
Description**

Given an array of n integer with duplicate number, and a moving window(size k), move the window at each iteration from the start of the array, find the maximum number inside the window at each moving.

Example
Example 1:

Input:
[1,2,7,7,8]
3

Output:
[7,7,8]

Explanation：
At first the window is at the start of the array like this `[|1, 2, 7| ,7, 8]` , return the maximum `7`;
then the window move one step forward.`[1, |2, 7 ,7|, 8]`, return the maximum `7`;
then the window move one step forward again.`[1, 2, |7, 7, 8|]`, return the maximum `8`;

Example 2:

Input:
[1,2,3,1,2,3]
5
Output:
[3,3]

Explanation:
At first, the state of the window is as follows: ` [,2,3,1,2,1 | , 3] `, a maximum of ` 3 `;
And then the window to the right one. ` [1, | 2,3,1,2,3 |] `, a maximum of ` 3 `;

