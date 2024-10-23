Select PRODUCT_CODE, price*_amt  from PRODUCT _p left join
    (SELECT PRODUCT_ID, sum(sales_amount) _amt from OFFLINE_SALE group by 1)_sa
    on _p.PRODUCT_ID=_sa.PRODUCT_ID order by 2 desc,1