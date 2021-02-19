/* Q1 */
SELECT NAME AS 'Product', PRODUCT_TYPE_CD AS 'Type'
FROM product

/* Q2 */
SELECT branch.NAME 'Branch', branch.CITY 'City', employee.LAST_NAME 'EmpLastName', employee.TITLE 'EmpTitle'
FROM branch 
INNER JOIN employee
ON branch.BRANCH_ID = employee.ASSIGNED_BRANCH_ID;

/* Q3 */
SELECT DISTINCT TITLE
FROM employee;

/* Q4 */
SELECT emp.LAST_NAME AS 'EmpLast', emp.TITLE AS 'EmpTitle', man.LAST_NAME AS 'ManLast', man.TITLE AS 'ManTitle'
FROM employee emp
LEFT JOIN employee man
ON emp.SUPERIOR_EMP_ID = man.EMP_ID;

/* Q5 */
SELECT product.NAME, account.AVAIL_BALANCE, individual.LAST_NAME
FROM account
LEFT JOIN product
	ON account.PRODUCT_CD = product.PRODUCT_CD
LEFT JOIN customer
	ON account.CUST_ID = customer.CUST_ID
LEFT JOIN individual
	ON customer.CUST_ID = individual.CUST_ID
	
/* Q6 */
SELECT individual.LAST_NAME, acc_transaction.*
FROM acc_transaction
LEFT JOIN account
	ON acc_transaction.ACCOUNT_ID = account.ACCOUNT_ID
LEFT JOIN individual
	ON account.CUST_ID = individual.CUST_ID
WHERE individual.LAST_NAME LIKE 'T%';