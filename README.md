HackerLand University has the following grading policy:<br>
&#9679; Every student receives a <b>grade</b> in the inclusive range from 0 to 100.<br>
&#9679; Any <b>grade</b> less than 40 is a failing grade.<br>
Sam is a professor at the university and likes to round each student's  according to these rules:<br>
&#9679; If the difference between the <b>grade</b> and the next multiple of 5 is less than 3, round up to the next multiple of 5.<br>
&#9679; If the value of <b>grade</b> is less than 38, no rounding occurs as the result will still be a failing grade.<br>
For example, <b>grade</b> = 84 will be rounded to 85 but <b>grade</b> = 29 will not be rounded because the rounding would result in a number that is less than 40.<br>
Given the initial value of <b>grade</b> for each of Sam's <b>n</b> students, write code to automate the rounding process. For each <b>grade<sub>i</sub></b>, round it according to the rules above and print the result on a new line.
<h2>Input Format</h2>
The first line contains a single integer denoting <b>n</b> (the number of students). 
Each line <b>i</b> of the <b>n</b> subsequent lines contains a single integer, <b>grade</b>, denoting student <b>i</b>'s grade.
<h2>Constrains</h2>
&#9679; 1 &le; n &le; 60<br>
&#9679; 0 &le; grade<sub>i</sub> &le; 100
<h2>Output Format</h2>
For each <b>grade<sub>i</sub></b> of the <b>n</b> grades, print the rounded grade on a new line.
<h2>Sample Input</h2>
4<br>
73<br>
67<br>
38<br>
33
<h2>Sample Output</h2>
75<br>
67<br>
40<br>
33
<h2>Explanation</h2><br>
1. Student 1 received a 73, and the next multiple of 5 from  is 75. Since 75 - 73 < 3, the student's grade is rounded to 75.<br>
2. Student 2 received a 67, and the next multiple of 5 from  is 70. Since 70 - 67 = 3, the grade will not be modified and the student's final grade is 67.<br>
3. Student 3 received a 38, and the next multiple of 5 from  is 40. Since 40 - 38 < 3, the student's grade will be rounded to 40.<br>
4. Student 4 received a grade below 38, so the grade will not be modified and the student's final grade is 33.<br>

