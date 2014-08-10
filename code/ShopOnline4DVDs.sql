/*
JOSKY 2014 || All rights reserved
*/
use master
CREATE DATABASE ShopOnline4DVDs
go
use ShopOnline4DVDs
go

-- Product
CREATE TABLE Products
(
	ProductID bigint identity(1,1),
	ProductName nvarchar(50) NOT NULL DEFAULT 'N/A',
	ProductPrice float(53),
	ProductReleaseDate date,
	ProductAvatar nvarchar(250),
	ProductURL nvarchar(250),
	ProductDesc nvarchar(250),

	CONSTRAINT PkProducts_ProductID PRIMARY KEY(ProductID),
)
go


