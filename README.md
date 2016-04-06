# WebSistemak_WebOrrialdea

	<% if((boolean)request.getAttribute("login_error")){ %>
	<section>
		<h3>LOGIN ERROR!!</h3>
	</section>
	<% } %>
	
Goian ikusten den atala loginForm.jsp-n jartzea ez dut lortzen HTTP status 500 ematen dit eta ezin dut lortu hau aldatzea, beraz, hemen azaltzen dut. (proiektuan ez dut funtzio hori esleituko)
