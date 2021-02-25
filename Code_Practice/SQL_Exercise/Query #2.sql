

SELECT COUNT(sc.studentId), c.name
FROM course c
    LEFT JOIN facultyCourse f
    ON c.id = f.courseId
    LEFT JOIN studentcourse sc
    ON sc.courseId = c.id
    /* LEFT JOIN faculty fac
    ON f.facultyId = fac.id */
WHERE f.facultyId IS NULL
GROUP BY c.name
ORDER BY c.name ASC;

SELECT Count(Distinct s.id) AS "Number of Students", YEAR(sc.startDate) AS "School Year"
FROM studentCourse sc
	LEFT JOIN student s
		ON sc.studentId = s.id
GROUP BY YEAR(sc.startDate)

SELECT Count(Distinct s.id) AS "Number of Students", YEAR(sc.startDate) AS "School Year"
FROM studentCourse sc
	LEFT JOIN student s
		ON sc.studentId = s.id
WHERE MONTH(sc.startDate) = 08
GROUP BY YEAR(sc.startDate)

SELECT s.firstname, s.lastname, COUNT(c.id), s.majorId, d.id
FROM student s
    LEFT JOIN studentCourse sc
        ON s.id = sc.studentId
    LEFT JOIN course c
        ON sc.courseId = c.id
    LEFT JOIN department d
        ON c.deptId = d.id
WHERE s.majorId = d.id
GROUP BY s.id
ORDER BY COUNT(c.id) DESC, s.firstname ASC, s.lastname ASC;

/* Q9 */
SELECT s.firstname AS "First Name", s.lastname AS "Last Name", FORMAT(AVG(sc.progress), 1) AS "Average Progress"
FROM student s
    LEFT JOIN studentCourse sc
        ON s.id = sc.studentId
GROUP BY s.id
HAVING AVG(sc.progress) < 50
ORDER BY AVG(sc.progress) DESC, s.firstname ASC, s.lastname ASC;

/* Q10 */
SELECT c.name AS "Course Name", ROUND(AVG(sc.progress), 1) AS "Average Progress"
FROM course c
    LEFT JOIN studentCourse sc
        ON c.id = sc.courseId
GROUP BY c.name
ORDER BY AVG (sc.progress) DESC

SELECT f.firstname AS "First Name", f.lastname AS "Last Name", ROUND(AVG(sc.progress), 1) AS "Average Progress"
FROM faculty f
    LEFT JOIN facultyCourse fc
        ON f.id = fc.facultyId
    LEFT JOIN studentCourse sc
        ON fc.courseId = sc.courseId
GROUP BY f.id
HAVING AVG(sc.progress)>0.9*(SELECT ROUND(AVG(progress), 1)
                                FROM studentCourse sc
                                    JOIN course c
                                        ON c.id = sc.courseId
                                GROUP BY sc.courseId
                                ORDER BY 1 DESC
                                LIMIT 1)
ORDER BY 3 DESC, 1, 2;