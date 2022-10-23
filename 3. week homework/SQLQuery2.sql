--Select
--ANSII
Select ContactName Adi ,CompanyName Sehiradi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

-- case insensitive
select * from Products where CategoryID = 1 or CategoryID = 3

select * from Products where CategoryID = 1 and  UnitPrice>= 10

--order by = verileri sıralama komutu

select * from Products where CategoryID=1 order by UnitPrice desc -- ascending  -- descending

select count (*) from Products where CategoryID=2

-- Hangi kategoride kaç farklı ürün var? -- group by gruplama komutu

select CategoryID, count (*) from Products where UnitPrice>20
group by CategoryID having count (*)<10

--inner join iki tabloda sadece eşleşen dataları bir araya getirir. Eşleşmeyen datayı bir araya getirmez.

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID= Categories.CategoryID
where Products.UnitPrice>10

-- left join (sol tarafta olup sağ tarafta olmayanları da getir.)

select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID=od.OrderID


select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null






--DTA Data Transformation Object




