# Exercise 1: Inventory Management System

## Problem Understanding

Inventory management systems handle a large number of products. Efficient storage and retrieval of product information is important for maintaining warehouse operations. Data Structures and Algorithms help improve performance and reduce processing time.

## Suitable Data Structures

- ArrayList
- HashMap
- Linked List

For this implementation, HashMap is used because it provides fast access to products using Product ID.

## Implementation

### Product Attributes

- Product ID
- Product Name
- Quantity
- Price

### Operations Performed

- Add Product
- Search Product
- Update Product
- Delete Product
- Display Products

## Data Structure Used

HashMap<Integer, Product>

Key : Product ID

Value : Product Object

## Time Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Add Product | O(1) |
| Search Product | O(1) |
| Update Product | O(1) |
| Delete Product | O(1) |

## Optimization

Using HashMap allows direct access to products through Product ID without traversing the entire collection.

## Conclusion

The Inventory Management System demonstrates how HashMap can be used to efficiently manage inventory records with fast insertion, retrieval, updating, and deletion operations.