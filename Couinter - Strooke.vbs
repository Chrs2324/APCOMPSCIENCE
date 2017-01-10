Set objShell = createObject("Wscript.shell")

result=Msgbox("Do you want to download MORE CS:GO Skins?",vbYesNo+vbInformation, "THIS IS OBVIOUSLY AN IMPORTANT MESSAGE!")

If result = vbYes Then

	objShell.Run("https://www.lootmarket.com/csgo")

Else 
	objShell.Run("https://www.lootmarket.com/csgo")

End If
	