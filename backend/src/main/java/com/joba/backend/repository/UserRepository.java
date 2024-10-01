public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.encryptedUsername = :encryptedUsername AND u.encryptedPassword = :encryptedPassword")
    User findByEncryptedUsernameAndPassword(@Param("encryptedUsername") String encryptedUsername, @Param("encryptedPassword") String encryptedPassword);

    
}