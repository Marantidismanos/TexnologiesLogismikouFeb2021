public class TestUserService{

    @Test
    public void correct(){
        assertTrue(UserService.changePassword("MARANTI","ASD54AS45D45AS45D"));
    }

    @Test
    public void Failure(){
        assertFalse(UserService.changePassword("MARANTI","");)
    }
}