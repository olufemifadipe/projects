Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Button1.Enabled = False
    End Sub

    Private Sub ResetForm()
        '
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""
        TextBox6.Text = ""
        TextBox7.Text = ""
        TextBox8.Text = ""

        CheckBox1.Checked = False
        Morning.Checked = False
        Afternoon.Checked = False
        Evening.Checked = False
        Weekend.Checked = False

        CheckBox1.Checked = False ' reset the all checkboxes


        Button1.Enabled = False 'reset the submit button
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

    End Sub

    Private Sub Label5_Click(sender As Object, e As EventArgs) Handles Label5.Click

    End Sub

    Private Sub Label7_Click(sender As Object, e As EventArgs) Handles Label7.Click

    End Sub

    Private Sub Label9_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub CheckedListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles Evening.CheckedChanged

    End Sub

    Private Sub Afternoon_SelectedIndexChanged(sender As Object, e As EventArgs) Handles Afternoon.CheckedChanged

    End Sub

    Public Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged

        Button1.Enabled = CheckBox1.Checked


    End Sub

    Private Sub Label10_Click(sender As Object, e As EventArgs) Handles Label10.Click

    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click

    End Sub

    Public Sub Button1_Click_1(sender As Object, e As EventArgs) Handles Button1.Click



        Dim strConfirmation As String

        Dim strFirstname As String

        strFirstname = TextBox1.Text

        MessageBox.Show("Thank you " & strFirstname & " for submiting your application!")

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged
        Dim strFirstname As String
    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles TextBox2.TextChanged
        Dim strLastname As String
    End Sub

    Private Sub TextBox3_TextChanged(sender As Object, e As EventArgs) Handles TextBox3.TextChanged
        Dim strAddress As String
    End Sub

    Private Sub TextBox4_TextChanged(sender As Object, e As EventArgs) Handles TextBox4.TextChanged
        Dim strCity As String
    End Sub

    Private Sub TextBox5_TextChanged(sender As Object, e As EventArgs) Handles TextBox5.TextChanged
        Dim strState As String
    End Sub

    Private Sub TextBox6_TextChanged(sender As Object, e As EventArgs) Handles TextBox6.TextChanged
        Dim intZip As Int128
    End Sub

    Private Sub TextBox8_TextChanged(sender As Object, e As EventArgs) Handles TextBox8.TextChanged
        Dim intNumber As Int128
    End Sub

    Private Sub TextBox7_TextChanged(sender As Object, e As EventArgs) Handles TextBox7.TextChanged
        Dim strEmail As String
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        'method call to reset the form 
        ResetForm()

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.Close()
    End Sub

    Private Sub CheckBox_CheckedChanged(sender As Object, e As EventArgs) Handles Morning.CheckedChanged, Afternoon.CheckedChanged, Evening.CheckedChanged, Weekend.CheckedChanged

        Dim chkBox As CheckBox = CType(sender, CheckBox)

        If chkBox.Checked Then
            MessageBox.Show(chkBox.Text & " is checked.") 'checked option on the checkbox 
        Else
            MessageBox.Show(chkBox.Text & " is unchecked.") 'unchecked option on the checkbox
        End If
    End Sub
End Class
