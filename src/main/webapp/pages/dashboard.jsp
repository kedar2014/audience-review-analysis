<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Reviews</title>
</head>
<body>
     ${review}
	<form action="addReview">
		Review ID:<br> <input type="text" name="reviewId"><br>
		Review:<br> <input type="text" name="review"> <br>
		Rating:<br> <input type="text" name="rating"> <br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>