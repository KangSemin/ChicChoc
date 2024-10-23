Select CATEGORY, sum(_sum) total_sales from BOOK _book left join
    (SELECT BOOK_ID _id, sum(sales) _sum from BOOK_SALES where date_format(SALES_DATE,'%y%m')='2201'
     group by BOOK_ID ) _sale on _book.BOOK_ID = _sale._id group by 1 order by 1;