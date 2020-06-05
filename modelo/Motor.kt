package modelo

class Motor (){
    private var rotacionMotor: Boolean = false
    fun rotacionHoraria (){
        rotacionMotor = true
    }
    fun rotacionAntihoraria(){
        rotacionMotor = false
    }

    fun checkMotorRotation(): String {
        return if (rotacionMotor == true)"El motor gira en sentido horario" else "El motor gira en sentido antihorario"
    }
}