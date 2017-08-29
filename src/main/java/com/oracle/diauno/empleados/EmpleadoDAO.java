package com.oracle.diauno.empleados;

public interface EmpleadoDAO {
    
    public void insertarEmpleado(Empleado emp);
    
    public void actualizarEmpleado(Empleado emp);
    
    public Empleado obtenerEmpleado(Empleado emp);
    
    public void eliminarEmpleado(Empleado emp);
    
}
