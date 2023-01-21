package com.example.android.permissionsdemo

import android.os.Build
import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    private val cameraResultLauncher : ActivityResultLauncher<String> =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ){
            isGranted ->
            if(isGranted){
                Toast.makeText(this, "Permission granted for camera", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Permission denied for camera", Toast.LENGTH_LONG).show()

            }
        }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCameraPermission : Button = findViewById(R.id.btn_camera_permission)
        btnCameraPermission.setOnClickListener {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                    shouldShowRequestPermissionRationale(Manifest.permission.CAMERA)){
                showRationaleDialog(" Permission Demo requires camera access",
                "Camera cannot be used because access is denied")
            }else{
                cameraResultLauncher.launch(Manifest.permission.CAMERA)
            }
        }


    }

    private fun showRationaleDialog(
        title: String,
        message: String
    ){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton("Cancel"){dialog, _->
                dialog.dismiss()
            }
        builder.create().show()
    }
}