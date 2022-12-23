
// using order by to  order the substr.
Select  name from students where marks > 75 order by substr(name,-3, 3), ID asc;