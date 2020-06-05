package modelo

/**
 * Las clases deben tener el mismo nombre que el archivo e iniciar con una variable
 * e iniciar con mayusculas
 */
class Camara {
    private var isOn: Boolean = false //Se restrige el acceso para que nadie lo altere más que la clase
    private var resolution: Int = 640
    private var cameraZoom: String = "X1"
    private var cameraFlash: Boolean = true
    fun setCameraFlash (flash: Boolean){
        this.cameraFlash = flash
    }
    fun getCameraFlash(): Boolean {
        return this.cameraFlash
    }
    fun setCameraZoom (zoom: String){
        this.cameraZoom = zoom
    }
    fun getCamerazoom(): String {
        return this.cameraZoom
    }
    fun setResolution(resolution: Int){
        this.resolution = resolution
        //This solo permite el acceso a los datos de la clase en la que se encuentra
    }

    fun getResolution(): Int {
        return this.resolution
    }

    fun trunOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun getCameraStatus(): String {
        return if (isOn) "Camera is turned" else "Camera is not turned"
    }

     /* fun setCamaraStatus(onOff: Boolean){
        isOn = onOff
    } */
}
