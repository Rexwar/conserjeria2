@AllArgsConstructor
@Builder
@Entity
public class Persona extends BaseModel{
    /**
     * The rut
     */
    @notnull
    private Long rut;

    /**
     * The nombre
     */
    @notnull
    private String nombre;

    /**
     * 
     */
}
