-- # Write your MySQL query statement below
-- SELECT
--   s.student_id,
--   s.student_name,
--   sub.subject_name,
--   COUNT(e.student_id) AS attended_exams
-- FROM Students s
-- CROSS JOIN Subjects sub
-- LEFT JOIN Examinations e
--   ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
-- GROUP BY s.student_id, s.student_name, sub.subject_name
-- ORDER BY s.student_id, sub.subject_name;




SELECT stud.student_id, stud.student_name, s.subject_name, COUNT(e.student_id) AS attended_exams
FROM Students stud
CROSS JOIN Subjects s
LEFT JOIN Examinations e
ON (stud.student_id = e.student_id AND s.subject_name = e.subject_name)
GROUP BY stud.student_id, stud.student_name, s.subject_name
ORDER BY stud.student_id, s.subject_name