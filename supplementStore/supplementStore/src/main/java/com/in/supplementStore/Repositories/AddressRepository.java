package com.in.supplementStore.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.in.supplementStore.Entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUserUserId(Long userId);

   /* @Modifying
    @Query("UPDATE Address a SET a.isDefault = false WHERE a.user.userId = :userId")
    void clearDefaultAddresses(@Param("userId") Long userId);

    @Modifying
    @Query("UPDATE Address a SET a.isDefault = true WHERE a.addressId = :addressId")
    void setDefaultAddress(@Param("addressId") Long addressId);*/
}
