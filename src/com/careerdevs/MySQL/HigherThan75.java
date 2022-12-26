
// using order by to  order the substr.
Select  name from students where marks > 75 order by substr(name,-3, 3), ID asc;
// we can also use the right condition;
        Select  name from students where marks > 75 order by right(name, 3),ID;