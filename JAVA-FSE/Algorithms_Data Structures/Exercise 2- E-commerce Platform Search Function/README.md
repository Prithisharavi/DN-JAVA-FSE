# Exercise 2: E-Commerce Platform Search Function

## Problem Understanding

Search functionality is an important component of an e-commerce platform. Customers expect products to be found quickly and efficiently. Algorithms help improve search performance and reduce response time.

## Big O Notation

Big O notation is used to measure the efficiency of an algorithm as the input size increases.

### Search Cases

- Best Case: Item found immediately.
- Average Case: Item found after several comparisons.
- Worst Case: Item found at the end or not found.

## Product Attributes

- Product ID
- Product Name
- Category

## Algorithms Implemented

### Linear Search

Linear Search checks each element one by one until the product is found.

### Binary Search

Binary Search repeatedly divides the sorted array into two halves to locate the product.

## Time Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|------------|------------|--------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Comparison

Linear Search is simple and works with unsorted data.

Binary Search is faster but requires the data to be sorted.

## Conclusion

Binary Search is more suitable for large e-commerce platforms because it provides significantly faster search performance compared to Linear Search.