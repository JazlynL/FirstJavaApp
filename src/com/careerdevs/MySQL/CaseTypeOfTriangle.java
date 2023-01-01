Select case
        when (A+B<=C) or (B+C<=C) or (C+A <=B) THEN 'Not A Triangle'
        when  A=B and B=C THEN 'Equilateral'
        when (A = B)  or (B = C)  or (A = C) THEN 'Isosceles'
        else 'Scalene'
        end from Triangles;