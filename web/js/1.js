function validate() 
	{
		var pwda = document.getElementById("psw1").value;
		var pwdb = document.getElementById("psw2").value;
		if(pwda == pwdb)
		{
			document.getElementById("pswtf").innerHTML="<font color='green'>两次密码相同</font>";
			document.getElementById("zcsubmit1").disabled = false;
		}
		else 
		{
			document.getElementById("pswtf").innerHTML="<font color='red'>两次密码不相同</font>";
			document.getElementById("zcsubmit1").disabled = true;
		}
	}